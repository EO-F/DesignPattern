public class Test {
    public static void main(String[] args) {
        ObjectFor3D subjectFor3d = new ObjectFor3D();

        Observer1 observer1 = new Observer1(subjectFor3d);
        Observer2 observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("20140420的3D号码是：127");
        subjectFor3d.setMsg("20140421的3D号码是：333");
    }
}
