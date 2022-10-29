package com.dl.stu.netty.ll;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author liuziqiang
 * @date 2022/08/31 16:07
 */
public class NettyClient {
    public static void main(String[] args) throws InterruptedException {
//创建线程组
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {

            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new NettyClientHandle());
            }
        });
        ChannelFuture future = bootstrap.connect("127.0.0.1", 9999).sync();
        future.channel().closeFuture().sync();
        group.shutdownGracefully();


    }
}