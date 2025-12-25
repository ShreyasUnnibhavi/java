public class shortestPath{
    public static int distance(String path){
        int i = 0, j = 0;
        for(int k = 0; k < path.length(); k++){
            int step = path.charAt(k);
            switch(step){
                case 'E': i++; break;
                case 'W': i--; break;
                case 'N': j++; break;
                case 'S': j--; break;
                default: System.out.print("invalid path");
            }
        }
        int d = (int)Math.sqrt(Math.pow((i-0),2) + Math.pow((j-0),2));
        return d;
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.print(distance(path));
    }
}