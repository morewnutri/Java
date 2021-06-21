public class test {
    public static void main(String[] args){
        String str1 = "asdafghjka";
        String str2 = "aaasfgh";

        int length =str2.length();

        for(int i=length;i>0;i--){
            for(int x=0,y=i;y<=length;x++,y++){
                String sub = str2.substring(x,y);
                if(str1.contains(sub)){
                    System.out.println("最大"+sub);
                    return;
                }
            }
        }
    }
}
