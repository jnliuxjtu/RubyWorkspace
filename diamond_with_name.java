public class diamond_with_name {
    public static void main (String[] args){
        int n = 3;
        String output ="";
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                output+=" ";
            }
            for(int k=0;k<2*i+1;k++){
                output+="*";
            }
            output+="\n";
        }
        output+="Junnan\n";
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                output+=" ";
            }
            for(int k=0;k<2*i+1;k++){
                output+="*";
            }
            output+="\n";
        }
        System.out.println(output);
    }
}