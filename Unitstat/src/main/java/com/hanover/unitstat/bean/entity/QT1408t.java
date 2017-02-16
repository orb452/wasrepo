package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1408t is a Querydsl query type for T1408t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1408t extends EntityPathBase<T1408t> {

    private static final long serialVersionUID = 1560185766L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1408t t1408t = new QT1408t("t1408t");

    public final DatePath<java.util.Date> acctEntDt = createDate("acctEntDt", java.util.Date.class);

    public final DatePath<java.util.Date> experModEffDt = createDate("experModEffDt", java.util.Date.class);

    public final NumberPath<Double> experModFctr = createNumber("experModFctr", Double.class);

    public final NumberPath<Double> expoAmt = createNumber("expoAmt", Double.class);

    public final StringPath expoCovg = createString("expoCovg");

    protected QT1408tId id;

    public final NumberPath<Double> manlRat = createNumber("manlRat", Double.class);

    public final DatePath<java.util.Date> manlRatEffDt = createDate("manlRatEffDt", java.util.Date.class);

    public final NumberPath<Double> prmAmt = createNumber("prmAmt", Double.class);

    public QT1408t(String variable) {
        this(T1408t.class, forVariable(variable), INITS);
    }

    public QT1408t(Path<? extends T1408t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1408t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1408t(PathMetadata<?> metadata, PathInits inits) {
        this(T1408t.class, metadata, inits);
    }

    public QT1408t(Class<? extends T1408t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1408tId(forProperty("id")) : null;
    }

    public QT1408tId id() {
        if (id == null) {
            id = new QT1408tId(forProperty("id"));
        }
        return id;
    }

}

