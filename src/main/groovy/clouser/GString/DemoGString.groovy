package clouser.GString

class DemoGString {

    public static void main(String[] args) {
        def x = 1
        def gs = "x = ${x}"
        assert gs == "x = 1"
        x = 2
        gs = "x = ${x}"
        assert gs == 'x = 2'
    }
}
