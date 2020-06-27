package com.example.springboot.ipml;

import com.example.thrift.thriftserver.Hello;
import org.apache.thrift.TException;

// 实现rpc接口服务端
public class HelloServiceImpl implements Hello.Iface{
    @Override
    public String helloString(String param) throws TException {
        return "hello: " + param;
    }

}
