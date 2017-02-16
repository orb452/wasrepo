package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT140ctId is a Querydsl query type for T140ctId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT140ctId extends BeanPath<T140ctId> {

    private static final long serialVersionUID = 396218198L;

    public static final QT140ctId t140ctId = new QT140ctId("t140ctId");

    public final StringPath class_ = createString("class_");

    public final StringPath riskSt = createString("riskSt");

    public QT140ctId(String variable) {
        super(T140ctId.class, forVariable(variable));
    }

    public QT140ctId(Path<? extends T140ctId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT140ctId(PathMetadata<?> metadata) {
        super(T140ctId.class, metadata);
    }

}

