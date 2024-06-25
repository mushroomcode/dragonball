package com.impl;

import java.lang.instrument.Instrumentation;

public class AgentDemo {
    //
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("=======liangle=======");
    }
}
