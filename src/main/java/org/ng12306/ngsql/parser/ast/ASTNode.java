package org.ng12306.ngsql.parser.ast;

import org.ng12306.ngsql.parser.visitor.SQLASTVisitor;


/**
 * @author <a href="mailto:shuo.qius@alibaba-inc.com">QIU Shuo</a>
 */
public interface ASTNode {
    void accept(SQLASTVisitor visitor);
}
