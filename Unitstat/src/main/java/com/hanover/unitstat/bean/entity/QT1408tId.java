package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1408tId is a Querydsl query type for T1408tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1408tId extends BeanPath<T1408tId> {

    private static final long serialVersionUID = 394937185L;

    public static final QT1408tId t1408tId = new QT1408tId("t1408tId");

    public final StringPath class_ = createString("class_");

    public final StringPath co = createString("co");

    public final StringPath corrId = createString("corrId");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath ratChgInd = createString("ratChgInd");

    public final StringPath riskSt = createString("riskSt");

    public QT1408tId(String variable) {
        super(T1408tId.class, forVariable(variable));
    }

    public QT1408tId(Path<? extends T1408tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1408tId(PathMetadata<?> metadata) {
        super(T1408tId.class, metadata);
    }

}

