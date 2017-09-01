public class diamond {
    public static void main (String[] args){
        int n = 3;
        String output ="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                output+=" ";
            }
            for(int k=0;k<2*i+1;k++){
                output+="*";
            }
            output+="\n";
        }
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