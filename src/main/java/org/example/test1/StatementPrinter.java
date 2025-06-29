package org.example.test1;

import java.util.List;
import java.io.PrintStream;
import java.time.format.DateTimeFormatter;

/**
 * Responsabilité unique : formater et imprimer un relevé lisible.
 */
class StatementPrinter {

    private static final String HEADER = "Date || Montant || Solde";
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final PrintStream out;
    StatementPrinter(PrintStream out) {
        this.out = out;
    }

    void print(List<Transaction> txs) {
        out.println(HEADER);
        for (int i = txs.size() - 1; i >= 0; i--) {
            Transaction t = txs.get(i);
            out.printf("%s || %d || %d%n",
                    t.date().format(FMT),
                    t.amount(),
                    t.balance());
        }
    }
}
