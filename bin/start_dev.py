import basic_setup as bs


def main():
    try:
        response = bs.execute(
            "docker-compose -f docker/docker-compose-local.yml up")
        print(response.std_out)
        if response.std_err:
            print('errors:')
            print(response.std_err)
    except KeyboardInterrupt:
        pass


if __name__ == '__main__':
    main()
