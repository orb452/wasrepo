package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1402tId is a Querydsl query type for T1402tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1402tId extends BeanPath<T1402tId> {

    private static final long serialVersionUID = 394758439L;

    public static final QT1402tId t1402tId = new QT1402tId("t1402tId");

    public final DatePath<java.util.Date> acctEntDt = createDate("acctEntDt", java.util.Date.class);

    public final StringPath co = createString("co");

    public final StringPath corrId = createString("corrId");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath riskSt = createString("riskSt");

    public final StringPath rptNbr = createString("rptNbr");

    public QT1402tId(String variable) {
        super(T1402tId.class, forVariable(variable));
    }

    public QT1402tId(Path<? extends T1402tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1402tId(PathMetadata<?> metadata) {
        super(T1402tId.class, metadata);
    }

}

