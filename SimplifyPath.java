import java.util.Stack;

public class SimplifyPath {
    public static String simplify(String path){
        String[] components = path.split("/");
        Stack<String> s = new Stack<>();

        for(String dir : components){
            if(dir.equals("..") && !s.isEmpty()){
                s.pop();
            }else if(!dir.equals(".") && !dir.isEmpty()){
                s.push(dir);
            }
        }

        StringBuilder res = new StringBuilder();
        for(String str : s){
            res.append("/").append(str);
        }

        return res.length() == 0? "/" : res.toString();
    }
    public static void main(String[] args) {
        String path = "/.../a/../b/c/../d/./";
        System.out.println(simplify(path));
    }
}
