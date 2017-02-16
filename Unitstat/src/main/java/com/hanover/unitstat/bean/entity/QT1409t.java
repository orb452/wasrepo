package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QT1409t is a Querydsl query type for T1409t
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT1409t extends EntityPathBase<T1409t> {

    private static final long serialVersionUID = 1560185797L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QT1409t t1409t = new QT1409t("t1409t");

    public final DatePath<java.util.Date> acctEntDt = createDate("acctEntDt", java.util.Date.class);

    public final DatePath<java.util.Date> acdtDt = createDate("acdtDt", java.util.Date.class);

    public final StringPath aiaCausCd = createString("aiaCausCd");

    public final StringPath aiaNatrCd = createString("aiaNatrCd");

    public final StringPath aiaPartCd = createString("aiaPartCd");

    public final NumberPath<Double> alaeAmt = createNumber("alaeAmt", Double.class);

    public final StringPath caseNbr = createString("caseNbr");

    public final NumberPath<Short> catNbr = createNumber("catNbr", Short.class);

    public final StringPath clmStat = createString("clmStat");

    public final NumberPath<Double> clmtAttyAmt = createNumber("clmtAttyAmt", Double.class);

    public final NumberPath<Double> dedReimbAmt = createNumber("dedReimbAmt", Double.class);

    public final NumberPath<Double> emplrAttyAmt = createNumber("emplrAttyAmt", Double.class);

    public final StringPath fdltClmCd = createString("fdltClmCd");

    protected QT1409tId id;

    public final NumberPath<Integer> indmIncrdAmt = createNumber("indmIncrdAmt", Integer.class);

    public final NumberPath<Integer> indmPdAmt = createNumber("indmPdAmt", Integer.class);

    public final StringPath jursdStCd = createString("jursdStCd");

    public final StringPath lcActCd = createString("lcActCd");

    public final StringPath lcCovgTypCd = createString("lcCovgTypCd");

    public final StringPath lcLossTypCd = createString("lcLossTypCd");

    public final StringPath lcRcvrTypCd = createString("lcRcvrTypCd");

    public final StringPath lcSetlmtTypCd = createString("lcSetlmtTypCd");

    public final StringPath lumpSumInd = createString("lumpSumInd");

    public final StringPath mcoCd = createString("mcoCd");

    public final NumberPath<Integer> medIncrdAmt = createNumber("medIncrdAmt", Integer.class);

    public final NumberPath<Integer> medPdAmt = createNumber("medPdAmt", Integer.class);

    public final StringPath soclSecrtyNbr = createString("soclSecrtyNbr");

    public final StringPath vocRehabInd = createString("vocRehabInd");

    public final NumberPath<Double> wklyWageAmt = createNumber("wklyWageAmt", Double.class);

    public QT1409t(String variable) {
        this(T1409t.class, forVariable(variable), INITS);
    }

    public QT1409t(Path<? extends T1409t> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1409t(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QT1409t(PathMetadata<?> metadata, PathInits inits) {
        this(T1409t.class, metadata, inits);
    }

    public QT1409t(Class<? extends T1409t> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QT1409tId(forProperty("id")) : null;
    }

    public QT1409tId id() {
        if (id == null) {
            id = new QT1409tId(forProperty("id"));
        }
        return id;
    }

}

