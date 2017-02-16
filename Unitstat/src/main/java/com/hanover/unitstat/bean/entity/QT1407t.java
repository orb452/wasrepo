package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1407t is a Querydsl query type for T1407t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1407t extends EntityPathBase<T1407t> {

    private static final long serialVersionUID = 1560185735L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1407t t1407t = new QT1407t("t1407t");

    public final DatePath<java.util.Date> acctEntDt = createDate("acctEntDt", java.util.Date.class);

    public final DatePath<java.util.Date> cancDt = createDate("cancDt", java.util.Date.class);

    public final StringPath fedEmplrId = createString("fedEmplrId");

    protected QT1407tId id;

    public final StringPath insrdNm = createString("insrdNm");

    public final StringPath pcAsignInd = createString("pcAsignInd");

    public final StringPath pcCancInd = createString("pcCancInd");

    public final StringPath pcFixRatInd = createString("pcFixRatInd");

    public final StringPath pcFnlAudInd = createString("pcFnlAudInd");

    public final StringPath pcMultiStInd = createString("pcMultiStInd");

    public final StringPath pcRetroRatInd = createString("pcRetroRatInd");

    public final DatePath<java.util.Date> polExpDt = createDate("polExpDt", java.util.Date.class);

    public QT1407t(String variable) {
        this(T1407t.class, forVariable(variable), INITS);
    }

    public QT1407t(Path<? extends T1407t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1407t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1407t(PathMetadata<?> metadata, PathInits inits) {
        this(T1407t.class, metadata, inits);
    }

    public QT1407t(Class<? extends T1407t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1407tId(forProperty("id")) : null;
    }

    public QT1407tId id() {
        if (id == null) {
            id = new QT1407tId(forProperty("id"));
        }
        return id;
    }

}

