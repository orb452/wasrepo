package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT000kt is a Querydsl query type for T000kt
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT000kt extends EntityPathBase<T000kt> {

    private static final long serialVersionUID = 1559144662L;

    public static final QT000kt t000kt = new QT000kt("t000kt");

    public final StringPath st = createString("st");

    public final StringPath stBgnZip5 = createString("stBgnZip5");

    public final StringPath stEndZip5 = createString("stEndZip5");

    public final StringPath stFedNbr = createString("stFedNbr");

    public final StringPath stName = createString("stName");

    public final StringPath stNumeric = createString("stNumeric");

    public QT000kt(String variable) {
        super(T000kt.class, forVariable(variable));
    }

    public QT000kt(Path<? extends T000kt> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT000kt(PathMetadata<?> metadata) {
        super(T000kt.class, metadata);
    }

}

