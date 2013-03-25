package org.ng12306.ngsql.parser.ast;

import org.ng12306.ngsql.parser.visitor.SQLASTVisitor;


public interface ASTNode {
    void accept(SQLASTVisitor visitor);
}
