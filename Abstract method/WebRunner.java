package com.xworkz.Runner;

import com.xworkz.Abstraction.GlueWeb;
import com.xworkz.Abstraction.Web;

public class WebRunner {
    public static void main(String[] args) {
        Web web = new GlueWeb();
        web.autoConnect();
        web.toString();
    }
}
