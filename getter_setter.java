class gs{
    int id_num;
    String name;
   public void set(int id1, String name1){
       this.id_num=id1;
       this.name=name1;
   }
   public int getId_num(){
      return id_num;

   }
   public String getName(){
       return name;
   }

}



public class getter_setter {
    public static void main(String[] args) {
        gs obj =new gs();
        obj.set(1234,"pooji");
        System.out.println(obj.getId_num());
        System.out.println(obj.getName());


    }
}
