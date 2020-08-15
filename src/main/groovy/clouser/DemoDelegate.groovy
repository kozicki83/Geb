package clouser

class DemoDelegate {

    public static void main(String[] args) {

        def whatIsTisObject = { getThisObject() }
        assert whatIsTisObject() == this
        def whatIsThis = { this }
        assert whatIsThis() == this
    }
}
