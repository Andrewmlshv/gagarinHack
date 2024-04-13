package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UserdiscountId implements Serializable {
    private static final long serialVersionUID = -2685653038289640174L;
    @NotNull
    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @NotNull
    @Column(name = "iddiscount", nullable = false)
    private Integer iddiscount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserdiscountId entity = (UserdiscountId) o;
        return Objects.equals(this.iduser, entity.iduser) &&
                Objects.equals(this.iddiscount, entity.iddiscount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, iddiscount);
    }

}