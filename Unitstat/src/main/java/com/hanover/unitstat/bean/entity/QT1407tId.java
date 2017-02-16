package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1407tId is a Querydsl query type for T1407tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1407tId extends BeanPath<T1407tId> {

    private static final long serialVersionUID = 394907394L;

    public static final QT1407tId t1407tId = new QT1407tId("t1407tId");

    public final StringPath co = createString("co");

    public final StringPath corrId = createString("corrId");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath rptNbr = createString("rptNbr");

    public QT1407tId(String variable) {
        super(T1407tId.class, forVariable(variable));
    }

    public QT1407tId(Path<? extends T1407tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1407tId(PathMetadata<?> metadata) {
        super(T1407tId.class, metadata);
    }

}

