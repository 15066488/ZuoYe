package JDBC;

public class Clazz {
    private int cid;
    private String cname;
    public Clazz(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Clazz() {
    }
    public void show() {
        System.out.println("ClassBean{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}');;
    }


}

