package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1401tId is a Querydsl query type for T1401tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1401tId extends BeanPath<T1401tId> {

    private static final long serialVersionUID = 394728648L;

    public static final QT1401tId t1401tId = new QT1401tId("t1401tId");

    public final StringPath co = createString("co");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath riskSt = createString("riskSt");

    public QT1401tId(String variable) {
        super(T1401tId.class, forVariable(variable));
    }

    public QT1401tId(Path<? extends T1401tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1401tId(PathMetadata<?> metadata) {
        super(T1401tId.class, metadata);
    }

}

