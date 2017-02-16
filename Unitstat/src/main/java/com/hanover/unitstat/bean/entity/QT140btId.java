package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT140btId is a Querydsl query type for T140btId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT140btId extends BeanPath<T140btId> {

    private static final long serialVersionUID = 396188407L;

    public static final QT140btId t140btId = new QT140btId("t140btId");

    public final StringPath co = createString("co");

    public final StringPath corrId = createString("corrId");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath rptNbr = createString("rptNbr");

    public QT140btId(String variable) {
        super(T140btId.class, forVariable(variable));
    }

    public QT140btId(Path<? extends T140btId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT140btId(PathMetadata<?> metadata) {
        super(T140btId.class, metadata);
    }

}

