public class App {
    public static void main(String[] args) throws Exception {
        Cd cd = new Cd("canzoni" , "AdrianoCelentano" , 25, 90);
        System.out.println(cd.getAutore());
        System.out.println(cd);
        Cd cd1 = new Cd ("canzoni2 " , "Cesare Battisti" , 34, 100 );
        System.out.println(cd.compareDurata(cd1));
        Portacd portacd = new Portacd(7);
        System.out.println(portacd.getNum_max_dischi());
        System.out.println(portacd.setCd(cd1, 5));
        System.out.println(portacd.getCd(0));
        System.out.println(portacd.KillCd(0));
        System.out.println(portacd.getCd(0));
        System.out.println(portacd.getN());
        System.out.println(portacd.Cercacdpertitolo("canzoni"));
    }
}
