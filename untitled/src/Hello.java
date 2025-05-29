import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Hello {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("--서버 종료 Q + Enter -------");
        System.out.println("---------------------------");
        // TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        scanner.close();

        stopServer();
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // ServerSocket 생성 및 Port 바인딩
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        Socket socket = serverSocket.accept();

                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                    }
                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                serverSocket.close();
                System.out.println("[서버] 종료됨");
            } catch (IOException e) {
                System.out.println("[서버] 종료 중 오류: " + e.getMessage());
            }
        }
    }
}
