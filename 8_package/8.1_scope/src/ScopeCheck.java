public class ScopeCheck {
    private int privateVar=1;
    public int publicVar=0;

    public ScopeCheck() {
        System.out.println("ScopeCheck created \npublicVar = "+publicVar+"\nprivateVar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar=2;
        for(int i=0;i<10;i++)
            System.out.println(i+" times two is "+i*privateVar);
    }
}
