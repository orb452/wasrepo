package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT140bt is a Querydsl query type for T140bt
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT140bt extends EntityPathBase<T140bt> {

    private static final long serialVersionUID = 1560187068L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT140bt t140bt = new QT140bt("t140bt");

    public final StringPath addr = createString("addr");

    protected QT140btId id;

    public QT140bt(String variable) {
        this(T140bt.class, forVariable(variable), INITS);
    }

    public QT140bt(Path<? extends T140bt> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT140bt(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT140bt(PathMetadata<?> metadata, PathInits inits) {
        this(T140bt.class, metadata, inits);
    }

    public QT140bt(Class<? extends T140bt> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT140btId(forProperty("id")) : null;
    }

    public QT140btId id() {
        if (id == null) {
            id = new QT140btId(forProperty("id"));
        }
        return id;
    }

}

