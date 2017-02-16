package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1406t is a Querydsl query type for T1406t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1406t extends EntityPathBase<T1406t> {

    private static final long serialVersionUID = 1560185704L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1406t t1406t = new QT1406t("t1406t");

    protected QT1406tId id;

    public final StringPath occuDescr = createString("occuDescr");

    public QT1406t(String variable) {
        this(T1406t.class, forVariable(variable), INITS);
    }

    public QT1406t(Path<? extends T1406t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1406t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1406t(PathMetadata<?> metadata, PathInits inits) {
        this(T1406t.class, metadata, inits);
    }

    public QT1406t(Class<? extends T1406t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1406tId(forProperty("id")) : null;
    }

    public QT1406tId id() {
        if (id == null) {
            id = new QT1406tId(forProperty("id"));
        }
        return id;
    }

}

