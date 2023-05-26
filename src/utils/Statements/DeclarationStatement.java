package src.utils.Statements;

import src.utils.Statement;

public class DeclarationStatement extends Statement
{
    String variableName;

    public DeclarationStatement(
        int _type,
        String _variableName
    ){
        super( Statement.DEFINITION );
        this.variableName = _variableName;
    }
}
