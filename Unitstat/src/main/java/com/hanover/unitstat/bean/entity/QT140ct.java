package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT140ct is a Querydsl query type for T140ct
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT140ct extends EntityPathBase<T140ct> {

    private static final long serialVersionUID = 1560187099L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT140ct t140ct = new QT140ct("t140ct");

    public final StringPath classTyp = createString("classTyp");

    protected QT140ctId id;

    public QT140ct(String variable) {
        this(T140ct.class, forVariable(variable), INITS);
    }

    public QT140ct(Path<? extends T140ct> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT140ct(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT140ct(PathMetadata<?> metadata, PathInits inits) {
        this(T140ct.class, metadata, inits);
    }

    public QT140ct(Class<? extends T140ct> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT140ctId(forProperty("id")) : null;
    }

    public QT140ctId id() {
        if (id == null) {
            id = new QT140ctId(forProperty("id"));
        }
        return id;
    }

}

