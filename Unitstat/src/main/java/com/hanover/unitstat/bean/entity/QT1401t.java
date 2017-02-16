package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1401t is a Querydsl query type for T1401t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1401t extends EntityPathBase<T1401t> {

    private static final long serialVersionUID = 1560185549L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1401t t1401t = new QT1401t("t1401t");

    protected QT1401tId id;

    public final StringPath ncciCo = createString("ncciCo");

    public final StringPath ncciPolNbr = createString("ncciPolNbr");

    public final StringPath ncciRiskId = createString("ncciRiskId");

    public QT1401t(String variable) {
        this(T1401t.class, forVariable(variable), INITS);
    }

    public QT1401t(Path<? extends T1401t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1401t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1401t(PathMetadata<?> metadata, PathInits inits) {
        this(T1401t.class, metadata, inits);
    }

    public QT1401t(Class<? extends T1401t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1401tId(forProperty("id")) : null;
    }

    public QT1401tId id() {
        if (id == null) {
            id = new QT1401tId(forProperty("id"));
        }
        return id;
    }

}

