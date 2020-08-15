package autoClone

import groovy.transform.AutoClone

//@AutoClone(excludes = ['teacher'])
@AutoClone()
class Course {
    String name
    Date date
    Teacher teacher
}
