package clouser

class NestedClouser {

    void run() {
        def nestedClouser = {
            def cl = { owner }
            cl()
        }
        assert nestedClouser() == nestedClouser
    }
}
