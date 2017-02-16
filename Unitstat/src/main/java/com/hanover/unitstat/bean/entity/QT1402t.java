package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1402t is a Querydsl query type for T1402t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1402t extends EntityPathBase<T1402t> {

    private static final long serialVersionUID = 1560185580L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1402t t1402t = new QT1402t("t1402t");

    public final StringPath cmt = createString("cmt");

    public final StringPath corrSrcTyp = createString("corrSrcTyp");

    public final NumberPath<Double> dedAmt = createNumber("dedAmt", Double.class);

    public final StringPath dedTyp = createString("dedTyp");

    protected QT1402tId id;

    public final DatePath<java.util.Date> ncciRptDt = createDate("ncciRptDt", java.util.Date.class);

    public final StringPath rptCorrTyp = createString("rptCorrTyp");

    public final DatePath<java.util.Date> rptModDt = createDate("rptModDt", java.util.Date.class);

    public final DatePath<java.util.Date> stEffDt = createDate("stEffDt", java.util.Date.class);

    public final NumberPath<Integer> stSerNbr = createNumber("stSerNbr", Integer.class);

    public QT1402t(String variable) {
        this(T1402t.class, forVariable(variable), INITS);
    }

    public QT1402t(Path<? extends T1402t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1402t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1402t(PathMetadata<?> metadata, PathInits inits) {
        this(T1402t.class, metadata, inits);
    }

    public QT1402t(Class<? extends T1402t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1402tId(forProperty("id")) : null;
    }

    public QT1402tId id() {
        if (id == null) {
            id = new QT1402tId(forProperty("id"));
        }
        return id;
    }

}

