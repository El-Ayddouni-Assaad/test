import java.util.List;
public class main {
    public static void main(String[] args) {
        Enterprise e=new Enterprise("1","Sumsung");
        EnterpriseImp enterpriseImp=new EnterpriseImp();
        enterpriseImp.create();
        /*enterpriseImp.deleteEnterprise(e);*/
        List<Enterprise> l=enterpriseImp.getAll();
        if(l.size()==0){
            System.out.println("pas d'occurence dans la table");
        }else{
            for (Enterprise e1: l) {
                System.out.println(e1);
            }
        }
        System.out.println(enterpriseImp.getE(e));
    }
}
