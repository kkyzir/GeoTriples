package org.d2rq.db.expr;

import org.d2rq.db.renamer.Renamer;
import org.d2rq.db.types.DataType.GenericType;



public class LessThan extends BinaryOperator {

	public LessThan(Expression expr1, Expression expr2) {
		super(expr1, expr2, "<", false, GenericType.BOOLEAN);
	}

	public Expression rename(Renamer columnRenamer) {
		return new LessThan(expr1.rename(columnRenamer), expr2.rename(columnRenamer));
	}
}
