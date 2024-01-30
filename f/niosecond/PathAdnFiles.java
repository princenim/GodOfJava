package f.niosecond;

/**
 * @author hazel
 */
public class PathAdnFiles {
    public static void main(String[] args) {
        PathAdnFiles sample = new PathAdnFiles();
        String dir = "/Users/hyeonjungchoi/Desktop/dev/godofjava/nio/nio2";
        //String dir2 = "/Users";
        String fileName = "AboubThisBook.txt";


        //sample.checkPath2(dir, dir2);
        //sample.checkPath(dir);


    }

//    public void checkPath(String dir) {
//        Path path = Paths.get(dir);
//        System.out.println(path);
//        System.out.println(path.getFileName());
//
//    }
//
//    public void checkPath2(String dir1, String dir2) {
//        Path path = Paths.get(dir1);
//        Path path2 = Paths.get(dir2);
//
//        Path relativize = path.relativize(path2);//현재패스에서 매개변수로 넘긴 경로로 커맨드 창으로 어떻게 이동해야할지 알려준다.
//        System.out.println(relativize);
//        System.out.println(relativize.toAbsolutePath());
//
//
//    }
}
