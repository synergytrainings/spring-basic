package com.synisys.training.model.functionals;

import java.util.Objects;

/**
 * Created by user on 7/25/2015.
 */
public class AbstractFunctional<T> {
    private T project;
    private int id;


    public AbstractFunctional(T project) {
        this.project = project;
    }


    public T getProject() {
        return project;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.project.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            AbstractFunctional<T> that = (AbstractFunctional<T>) obj;
//            return Objects.equals(this.id, that.id) && Objects.equal(this.functionalStatus, that.functionalStatus); TODO: Check
        }
        return false;
    }
}
