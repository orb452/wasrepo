package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT140er is a Querydsl query type for T140er
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QT140er extends EntityPathBase<T140er> {

    private static final long serialVersionUID = 1560187159L;

    public static final QT140er t140er = new QT140er("t140er");

    public final StringPath co = createString("co");

    public final StringPath coNm = createString("coNm");

    public final StringPath ncciCo = createString("ncciCo");

    public QT140er(String variable) {
        super(T140er.class, forVariable(variable));
    }

    public QT140er(Path<? extends T140er> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT140er(PathMetadata<?> metadata) {
        super(T140er.class, metadata);
    }

}

