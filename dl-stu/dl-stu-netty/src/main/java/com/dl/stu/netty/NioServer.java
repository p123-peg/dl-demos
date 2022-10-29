package com.dl.stu.netty;

import io.netty.channel.local.LocalAddress;
import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author liuziqiang
 * @date 2022/08/09 10:26
 */
public class NioServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //打开一个服务器通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(9999));
        serverSocketChannel.configureBlocking(false);
        System.out.println("服务端通道配置成功");
        while (true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel == null){
                System.out.println("开始做其他事情了");
                Thread.sleep(3000);
                continue;

            }
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //read返回参数是0 代表是没有读到有效字数
            //             -1 代表是读到了末尾
            int read = socketChannel.read(byteBuffer);
            System.out.println(new String(byteBuffer.array(),0,read));
            socketChannel.write(ByteBuffer.wrap("我是谁".getBytes(StandardCharsets.UTF_8)));
            //释放资源
            socketChannel.close();



        }


    }
}