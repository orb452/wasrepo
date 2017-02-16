package com.hanover.unitstat.bean.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QT1409tId is a Querydsl query type for T1409tId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QT1409tId extends BeanPath<T1409tId> {

    private static final long serialVersionUID = 394966976L;

    public static final QT1409tId t1409tId = new QT1409tId("t1409tId");

    public final StringPath class_ = createString("class_");

    public final StringPath clmNbr = createString("clmNbr");

    public final StringPath clmOfc = createString("clmOfc");

    public final StringPath co = createString("co");

    public final StringPath corrId = createString("corrId");

    public final NumberPath<Short> grpClmCnt = createNumber("grpClmCnt", Short.class);

    public final StringPath injCd = createString("injCd");

    public final StringPath lossCovg = createString("lossCovg");

    public final DatePath<java.util.Date> polEffDt = createDate("polEffDt", java.util.Date.class);

    public final NumberPath<Short> polMod = createNumber("polMod", Short.class);

    public final StringPath polNbr = createString("polNbr");

    public final StringPath polSym = createString("polSym");

    public final StringPath riskSt = createString("riskSt");

    public final StringPath rptNbr = createString("rptNbr");

    public QT1409tId(String variable) {
        super(T1409tId.class, forVariable(variable));
    }

    public QT1409tId(Path<? extends T1409tId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QT1409tId(PathMetadata<?> metadata) {
        super(T1409tId.class, metadata);
    }

}

