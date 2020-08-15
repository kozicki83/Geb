package autoClone

class Demo {

    static void main(String[] args) {
        def mrhaki = new Teacher(name: 'Marek')
        def coures = new Course(name: 'Groovy + 101', date: new Date() + 10, teacher: mrhaki)


        def secondCoures = coures.clone()
        assert secondCoures != coures
        assert !secondCoures.is(coures)
        assert secondCoures.teacher != coures.teacher

        // change property on cloned instance
        secondCoures.name = 'Groovy 1111'
        assert secondCoures.name == 'Groovy 1111'
        assert coures.name == 'Groovy + 101'
    }
}
