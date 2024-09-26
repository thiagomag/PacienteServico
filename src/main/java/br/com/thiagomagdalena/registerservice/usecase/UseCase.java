package br.com.thiagomagdalena.registerservice.usecase;


public interface UseCase<Input, Output> {

    Output execute(Input entry);

    default Output execute(Input entry, Object... args) {
        return execute(entry);
    }

}
