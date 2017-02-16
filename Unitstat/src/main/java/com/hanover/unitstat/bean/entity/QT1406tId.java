package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1406tId is a Querydsl query type for T1406tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1406tId extends BeanPath<T1406tId> {

    private static final long serialVersionUID = 394877603L;

    public static final QT1406tId t1406tId = new QT1406tId("t1406tId");

    public final StringPath class_ = createString("class_");

    public final StringPath riskSt = createString("riskSt");

    public QT1406tId(String variable) {
        super(T1406tId.class, forVariable(variable));
    }

    public QT1406tId(Path<? extends T1406tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1406tId(PathMetadata<?> metadata) {
        super(T1406tId.class, metadata);
    }

}

