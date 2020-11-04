import com.liang.deom01.Client;
import com.liang.deom01.Host;
import com.liang.deom01.Proxy;

public class MyTest {
    public static void main(String[] args) {

        Host host=new Host();
        Proxy proxy=new Proxy(host);
        proxy.rent(); //客户不用去找房东，直接找中介就可以了

        Client client=new Client(host);
        client.rent();

    }
}
