package common

class BaseBuilder<T, SELF extends BaseBuilder> {
    protected T obj
    protected Map<String, Object> values = [:]

    SELF withValue(Map<String, Object> values) {
        this.values = values ?: [:]
        return (SELF) this
    }

    T build() {
        values.each { v ->
            if(this.metaClass.respondsTo(this, "with${v.key.capitalize()}", v.value)){
                this."with${v.key.capitalize()}"(v.value)
            } else {
                obj."${v.key}" = v.value
            }
        }
        return obj
    }
}
