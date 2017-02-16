package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT140frUnitstatClass is a Querydsl query type for T140frUnitstatClass
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT140frUnitstatClass extends EntityPathBase<T140frUnitstatClass> {

    private static final long serialVersionUID = 947906794L;

    public static final QT140frUnitstatClass t140frUnitstatClass = new QT140frUnitstatClass("t140frUnitstatClass");

    public final StringPath classCd = createString("classCd");

    public final StringPath classDesc = createString("classDesc");

    public QT140frUnitstatClass(String variable) {
        super(T140frUnitstatClass.class, forVariable(variable));
    }

    public QT140frUnitstatClass(Path<? extends T140frUnitstatClass> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT140frUnitstatClass(PathMetadata<?> metadata) {
        super(T140frUnitstatClass.class, metadata);
    }

}

