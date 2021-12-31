package test;

import java.io.IOException;

public class test_api {
    public static void main(String[] args) throws IOException {

        Script_api script_api = new Script_api();
          Object a = script_api.script_test("http://localhost:8080/api/weather/");
          //Object b = script_api.script_test_404("http://localhost:8080/api/weather/hhhh");
          System.out.println(a);
          //System.out.println(b);
    }
}
